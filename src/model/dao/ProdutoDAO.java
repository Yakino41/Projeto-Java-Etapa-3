package model.dao;

import connection.ConnectionBanco;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import static javax.swing.JOptionPane.ERROR_MESSAGE;
import modelo.*;

public class ProdutoDAO {

    Processador proc;
    PlacaDeVideo placaV;
    PlacaMae placaM;

    public void createProc(Processador proc) {

        Connection con = ConnectionBanco.getConnection();
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("INSERT INTO Processador(marca,modelo,ano,preco,socketCompativel,nucleo,threads,freqBase,freqMax,data_Garantia)VALUES(?,?,?,?,?,?,?,?,?,?)");
            stmt.setString(1, proc.getMarca());
            stmt.setString(2, proc.getModelo());
            stmt.setInt(3, proc.getAno());
            stmt.setFloat(4, proc.getPreco());
            stmt.setString(5, proc.getSocketCompativel());
            stmt.setInt(6, proc.getNucleo());
            stmt.setInt(7, proc.getThreads());
            stmt.setFloat(8, proc.getFreqBase());
            stmt.setFloat(9, proc.getFreqMax());
            stmt.setString(10, proc.getDataGarantia());

            stmt.executeUpdate();

            JOptionPane.showMessageDialog(
                    null,
                    "Processador Salvo Com sucesso"
            );

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(
                    null,
                    "Erro ao Salvar: " + ex
            );
        } finally {
            ConnectionBanco.closeConnection(con, stmt);
        }

    }

    public List<Processador> read() {

        Connection con = ConnectionBanco.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<Processador> processadores = new ArrayList<>();

        try {
            stmt = con.prepareStatement("SELECT * FROM Processador");
            rs = stmt.executeQuery();

            while (rs.next()) {
                proc = new Processador();
                try {
                    proc.setMarca(rs.getString("marca"));
                    proc.setModelo(rs.getString("modelo"));
                } catch (ProcInvException | PlacaVidInvException | PlacaMaeInvException | ProcModInvException pie) {
                    JOptionPane.showMessageDialog(
                            null,
                            pie.getMessage(),
                            "ERRO",
                            ERROR_MESSAGE
                    );
                }

                try {
                    proc.setModelo(rs.getString("modelo"));
                } catch (ProcModInvException pmie) {
                    JOptionPane.showMessageDialog(
                            null,
                            pmie.getMessage(),
                            "ERRO",
                            ERROR_MESSAGE
                    );
                }
                try {
                    proc.setAno(rs.getInt("ano"));
                } catch (AnoInvException aie) {
                    JOptionPane.showMessageDialog(
                            null,
                            aie.getMessage(),
                            "ERRO",
                            ERROR_MESSAGE
                    );
                } catch (NumberFormatException nfe) {
                    JOptionPane.showMessageDialog(
                            null,
                            "[ERRO] Por Favor digite um numero inteiro EX: 2015",
                            "ERRO",
                            ERROR_MESSAGE
                    );
                }
                try {
                    proc.setPreco(rs.getFloat("preco"));
                } catch (PrecoInvException pie) {
                    JOptionPane.showMessageDialog(
                            null,
                            pie.getMessage(),
                            "ERRO",
                            ERROR_MESSAGE
                    );
                } catch (NumberFormatException nfe) {
                    JOptionPane.showMessageDialog(
                            null,
                            "[ERRO] Por Favor digite um numero inteiro EX: 2015",
                            "ERRO",
                            ERROR_MESSAGE
                    );
                }
                try {
                    proc.setSocketCompativel(rs.getString("socketCompativel"));
                } catch (SocketCompInvException scie) {
                    JOptionPane.showMessageDialog(
                            null,
                            scie.getMessage(),
                            "ERRO",
                            ERROR_MESSAGE
                    );

                }
                try {
                    proc.setNucleo(rs.getInt("nucleo"));
                } catch (NucleoInvException nie) {
                    JOptionPane.showMessageDialog(
                            null,
                            nie.getMessage(),
                            "ERRO",
                            ERROR_MESSAGE
                    );
                } catch (NumberFormatException nfe) {
                    JOptionPane.showMessageDialog(
                            null,
                            "[ERRO] Por Favor digite um numero inteiro.",
                            "ERRO",
                            ERROR_MESSAGE
                    );
                }
                try {
                    proc.setThreads(rs.getInt("threads"));
                } catch (ThreadsInvException tie) {
                    JOptionPane.showMessageDialog(
                            null,
                            tie.getMessage(),
                            "ERRO",
                            ERROR_MESSAGE
                    );

                } catch (NumberFormatException nfe) {
                    JOptionPane.showMessageDialog(
                            null,
                            "[ERRO] Por Favor digite um numero inteiro.",
                            "ERRO",
                            ERROR_MESSAGE
                    );
                }
                try {
                    proc.setFreqBase(rs.getFloat("freqBase"));
                } catch (FreqBaseInvException fbie) {
                    JOptionPane.showMessageDialog(
                            null,
                            fbie.getMessage(),
                            "ERRO",
                            ERROR_MESSAGE
                    );
                }
                try {
                    proc.setFreqMax(rs.getFloat("freqMax"));
                } catch (FreqMaxInvException fmie) {
                    JOptionPane.showMessageDialog(
                            null,
                            fmie.getMessage(),
                            "ERRO",
                            ERROR_MESSAGE
                    );
                }
                proc.setDataGarantia(rs.getString("data_Garantia"));
                processadores.add(proc);
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(
                    null,
                    "ERRO: " + ex
            );
        } finally {
            ConnectionBanco.closeConnection(con, stmt, rs);
        }
        return processadores;
    }

    public List<Produto> readAll() {

        Connection con = ConnectionBanco.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<Produto> produtos = new ArrayList<>();

        try {
            try {
                stmt = con.prepareStatement(
                        "SELECT 'Processador' AS tipo, marca, modelo, ano, preco, data_Garantia FROM Processador "
                        + "UNION ALL "
                        + "SELECT 'PlacaDeVideo' AS tipo, marca, modelo, ano, preco, data_Garantia FROM PlacaDeVideo "
                        + "UNION ALL "
                        + "SELECT 'PlacaMae' AS tipo, marca, modelo, ano, preco, data_Garantia FROM PlacaMae"
                );
            } catch (SQLException ex) {
                Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
            }

            rs = stmt.executeQuery();

            while (rs.next()) {

                String tipo = rs.getString("tipo");
                Produto produto = null;

                if (tipo.equals("Processador")) {
                    produto = new Processador();
                } else if (tipo.equals("PlacaDeVideo")) {
                    produto = new PlacaDeVideo();
                } else if (tipo.equals("PlacaMae")) {
                    produto = new PlacaMae();
                }

                if (produto == null) {
                    continue;
                }

                try {
                    produto.setMarca(rs.getString("marca"));
                    produto.setModelo(rs.getString("modelo"));
                    produto.setAno(rs.getInt("ano"));
                    produto.setPreco(rs.getFloat("preco"));
                    produto.setDataGarantia(rs.getString("data_Garantia"));
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(
                            null,
                            e.getMessage(),
                            "ERRO",
                            ERROR_MESSAGE
                    );
                }
                produtos.add(produto);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        return produtos;
    }

    public List<Produto> buscaLike(String marca) {

        Connection con = ConnectionBanco.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<Produto> produtos = new ArrayList<>();

        try {
            stmt = con.prepareStatement(
                    "SELECT * FROM ( "
                    + "   SELECT 'Processador' AS tipo, marca, modelo, ano, preco, data_Garantia FROM Processador "
                    + "   UNION ALL "
                    + "   SELECT 'PlacaDeVideo' AS tipo, marca, modelo, ano, preco, data_Garantia FROM PlacaDeVideo "
                    + "   UNION ALL "
                    + "   SELECT 'PlacaMae' AS tipo, marca, modelo, ano, preco, data_Garantia FROM PlacaMae "
                    + ") AS produtos "
                    + "WHERE marca LIKE ?"
            );

            stmt.setString(1, "%" + marca + "%");
            rs = stmt.executeQuery();

            while (rs.next()) {

                Produto produto = null;
                String tipo = rs.getString("tipo");
                if (tipo.equals("Processador")) {
                    produto = new Processador();
                } else if (tipo.equals("PlacaDeVideo")) {
                    produto = new PlacaDeVideo();
                } else if (tipo.equals("PlacaMae")) {
                    produto = new PlacaMae();
                }
                
                if(produto == null) continue;
                              
                try {
                    produto.setMarca(rs.getString("marca"));
                    produto.setModelo(rs.getString("modelo"));
                    produto.setAno(rs.getInt("ano"));
                    produto.setPreco(rs.getFloat("preco"));
                    produto.setDataGarantia(rs.getString("data_Garantia"));
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(
                            null,
                            e.getMessage(),
                            "ERRO",
                            ERROR_MESSAGE
                    );
                }
                produtos.add(produto);
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(
                    null,
                    "ERRO: " + ex
            );
        } finally {
            ConnectionBanco.closeConnection(con, stmt, rs);
        }
        return produtos;
    }

    public void updateProc(Processador proc, String marcaAntiga, String modeloAntigo) {

        Connection con = ConnectionBanco.getConnection();
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("UPDATE Processador SET marca = ?,modelo = ?,ano = ?,preco = ?,socketCompativel = ?,nucleo = ?,threads = ?,freqBase = ?,freqMax = ?,data_Garantia = ? "
                    + "WHERE marca = ?  AND modelo = ?");
            stmt.setString(1, proc.getMarca());
            stmt.setString(2, proc.getModelo());
            stmt.setInt(3, proc.getAno());
            stmt.setFloat(4, proc.getPreco());
            stmt.setString(5, proc.getSocketCompativel());
            stmt.setInt(6, proc.getNucleo());
            stmt.setInt(7, proc.getThreads());
            stmt.setFloat(8, proc.getFreqBase());
            stmt.setFloat(9, proc.getFreqMax());
            stmt.setString(10, proc.getDataGarantia());

            stmt.setString(11, marcaAntiga);
            stmt.setString(12, modeloAntigo);

            stmt.executeUpdate();

            JOptionPane.showMessageDialog(
                    null,
                    "Processador Alterado Com sucesso"
            );

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(
                    null,
                    "Erro ao Alterar: " + ex
            );
        } finally {
            ConnectionBanco.closeConnection(con, stmt);
        }

    }

    public Processador consProc(String marca, String modelo) {

        Connection con = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;

        try {
            con = ConnectionBanco.getConnection();
            stmt = con.prepareStatement("SELECT * FROM Processador WHERE marca = ? AND modelo = ?");
            stmt.setString(1, marca);
            stmt.setString(2, modelo);

            rs = stmt.executeQuery();

            if (rs.next()) { // Só entra se houver resultado
                proc = new Processador();
                try {
                    proc.setMarca(rs.getString("marca"));
                    proc.setModelo(rs.getString("modelo"));
                    proc.setAno(rs.getInt("ano"));
                    proc.setPreco(rs.getFloat("preco"));
                    proc.setSocketCompativel(rs.getString("socketCompativel"));
                    proc.setNucleo(rs.getInt("nucleo"));
                    proc.setThreads(rs.getInt("threads"));
                    proc.setFreqBase(rs.getFloat("freqBase"));
                    proc.setFreqMax(rs.getFloat("freqMax"));
                    proc.setDataGarantia(rs.getString("data_Garantia"));
                    System.out.println("ANO DO BANCO: " + rs.getInt("ano"));
                } catch (ProcInvException | PlacaVidInvException | PlacaMaeInvException | ProcModInvException ex) {
                    JOptionPane.showMessageDialog(null, ex.getMessage(), "ERRO", JOptionPane.ERROR_MESSAGE);
                } catch (AnoInvException | PrecoInvException | SocketCompInvException | NucleoInvException | ThreadsInvException | FreqBaseInvException | FreqMaxInvException ex) {
                    Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao buscar: " + ex);
        } finally {
            ConnectionBanco.closeConnection(con, stmt, rs);
        }

        return proc;
    }

    public void removeProc(Processador proc) {

        Connection con = ConnectionBanco.getConnection();
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("DELETE FROM Processador WHERE marca = ?  AND modelo = ?");
            stmt.setString(1, proc.getMarca());
            stmt.setString(2, proc.getModelo());
            stmt.executeUpdate();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(
                    null,
                    "Erro ao Remover: " + ex
            );
        } finally {
            ConnectionBanco.closeConnection(con, stmt);
        }

    }

    //SEÇÃO PLACA DE VIDEO
    public void createPlacaV(PlacaDeVideo placaV) {

        Connection con = ConnectionBanco.getConnection();
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("INSERT INTO PlacaDeVideo(marca,modelo,ano,preco,memoria,veloVram,tipoMemoria,numPci,saidaVideo,comprimento,largura,espessura,data_Garantia)VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?)");
            stmt.setString(1, placaV.getMarca());
            stmt.setString(2, placaV.getModelo());
            stmt.setInt(3, placaV.getAno());
            stmt.setFloat(4, placaV.getPreco());
            stmt.setInt(5, placaV.getMemoria());
            stmt.setFloat(6, placaV.getVeloVram());
            stmt.setString(7, placaV.getTipoMemoria());
            stmt.setFloat(8, placaV.getNumPci());
            stmt.setString(9, placaV.getSaidaVideo());
            stmt.setFloat(10, placaV.getDime().getComprimento());
            stmt.setFloat(11, placaV.getDime().getLargura());
            stmt.setFloat(12, placaV.getDime().getEspessura());
            stmt.setString(13, placaV.getDataGarantia());

            stmt.executeUpdate();

            if (stmt != null) {
                JOptionPane.showMessageDialog(
                        null,
                        "PlacaDeVideo Salva Com sucesso"
                );

            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(
                    null,
                    "Erro ao Salvar: " + ex
            );
        } finally {
            ConnectionBanco.closeConnection(con, stmt);
        }

    }

    public List<PlacaDeVideo> readPlacaV() {

        Connection con = ConnectionBanco.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<PlacaDeVideo> placasDeVideo = new ArrayList<>();

        try {
            stmt = con.prepareStatement("SELECT * FROM PlacaDeVideo");
            rs = stmt.executeQuery();

            while (rs.next()) {
                placaV = new PlacaDeVideo();
                try {
                    placaV.setMarca(rs.getString("marca"));
                    placaV.setModelo(rs.getString("modelo"));
                } catch (ProcInvException | PlacaVidInvException | PlacaMaeInvException | ProcModInvException pie) {
                    JOptionPane.showMessageDialog(
                            null,
                            pie.getMessage(),
                            "ERRO",
                            ERROR_MESSAGE
                    );
                }

                try {
                    placaV.setModelo(rs.getString("modelo"));
                } catch (ProcModInvException pmie) {
                    JOptionPane.showMessageDialog(
                            null,
                            pmie.getMessage(),
                            "ERRO",
                            ERROR_MESSAGE
                    );
                }
                try {
                    placaV.setAno(rs.getInt("ano"));
                } catch (AnoInvException aie) {
                    JOptionPane.showMessageDialog(
                            null,
                            aie.getMessage(),
                            "ERRO",
                            ERROR_MESSAGE
                    );
                } catch (NumberFormatException nfe) {
                    JOptionPane.showMessageDialog(
                            null,
                            "[ERRO] Por Favor digite um numero inteiro EX: 2015",
                            "ERRO",
                            ERROR_MESSAGE
                    );
                }
                try {
                    placaV.setPreco(rs.getFloat("preco"));
                } catch (PrecoInvException pie) {
                    JOptionPane.showMessageDialog(
                            null,
                            pie.getMessage(),
                            "ERRO",
                            ERROR_MESSAGE
                    );
                } catch (NumberFormatException nfe) {
                    JOptionPane.showMessageDialog(
                            null,
                            "[ERRO] Por Favor digite um numero inteiro EX: 2015",
                            "ERRO",
                            ERROR_MESSAGE
                    );
                }
                try {
                    placaV.setMemoria(rs.getInt("memoria"));
                } catch (MemoriaInvException mie) {
                    JOptionPane.showMessageDialog(
                            null,
                            mie.getMessage(),
                            "ERRO",
                            ERROR_MESSAGE
                    );
                } catch (NumberFormatException nfe) {
                    JOptionPane.showMessageDialog(
                            null,
                            "[ERRO] Por Favor digite um numero inteiro.",
                            "ERRO",
                            ERROR_MESSAGE
                    );
                }

                try {
                    placaV.setVeloVram(rs.getFloat("veloVram"));
                } catch (VeloVramException vve) {
                    JOptionPane.showMessageDialog(
                            null,
                            vve.getMessage(),
                            "ERRO",
                            ERROR_MESSAGE
                    );

                } catch (NumberFormatException nfe) {
                    JOptionPane.showMessageDialog(
                            null,
                            "[ERRO] Por Favor digite um numero flutuante.",
                            "ERRO",
                            ERROR_MESSAGE
                    );
                }
                try {
                    placaV.setTipoMemoria(rs.getString("tipoMemoria"));
                } catch (TipoMenInvException tmie) {
                    JOptionPane.showMessageDialog(
                            null,
                            tmie.getMessage(),
                            "ERRO",
                            ERROR_MESSAGE
                    );

                }

                try {
                    placaV.setNumPci(rs.getFloat("numPci"));
                } catch (NumPciException npe) {
                    JOptionPane.showMessageDialog(
                            null,
                            npe.getMessage(),
                            "ERRO",
                            ERROR_MESSAGE
                    );
                } catch (NumberFormatException nfe) {
                    JOptionPane.showMessageDialog(
                            null,
                            "[ERRO] Por Favor digite um numero flutuante.",
                            "ERRO",
                            ERROR_MESSAGE
                    );
                }

                placaV.setSaidaVideo(rs.getString("saidaVideo"));

                try {
                    placaV.getDime().setComprimento(rs.getFloat("comprimento"));
                } catch (NumberFormatException nfe) {
                    JOptionPane.showMessageDialog(
                            null,
                            "[ERRO] Por Favor digite um numero flutuante.",
                            "ERRO",
                            ERROR_MESSAGE
                    );
                }

                try {
                    placaV.getDime().setLargura(rs.getFloat("largura"));
                } catch (NumberFormatException nfe) {
                    JOptionPane.showMessageDialog(
                            null,
                            "[ERRO] Por Favor digite um numero flutuante.",
                            "ERRO",
                            ERROR_MESSAGE
                    );
                }

                try {
                    placaV.getDime().setEspessura(rs.getFloat("espessura"));
                } catch (NumberFormatException nfe) {
                    JOptionPane.showMessageDialog(
                            null,
                            "[ERRO] Por Favor digite um numero flutuante.",
                            "ERRO",
                            ERROR_MESSAGE
                    );
                }

                placaV.setDataGarantia(rs.getString("data_Garantia"));
                placasDeVideo.add(placaV);
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(
                    null,
                    "ERRO: " + ex
            );
        } finally {
            ConnectionBanco.closeConnection(con, stmt, rs);
        }
        return placasDeVideo;
    }

    public void updatePlacaV(PlacaDeVideo placaV, String marcaAntiga, String modeloAntigo) {

        Connection con = ConnectionBanco.getConnection();
        PreparedStatement stmt = null;

        try {

            stmt = con.prepareStatement("UPDATE PlacaDeVideo SET marca = ?,modelo = ?,ano = ?,preco = ?,memoria = ?,veloVram = ?,tipoMemoria = ?,numPci = ?,saidaVideo = ?,comprimento = ?,largura = ?,espessura = ?, "
                    + "data_Garantia = ? WHERE marca = ?  AND modelo = ?");
            stmt.setString(1, placaV.getMarca());
            stmt.setString(2, placaV.getModelo());
            stmt.setInt(3, placaV.getAno());
            stmt.setFloat(4, placaV.getPreco());
            stmt.setInt(5, placaV.getMemoria());
            stmt.setFloat(6, placaV.getVeloVram());
            stmt.setString(7, placaV.getTipoMemoria());
            stmt.setFloat(8, placaV.getNumPci());
            stmt.setString(9, placaV.getSaidaVideo());
            stmt.setFloat(10, placaV.getDime().getComprimento());
            stmt.setFloat(11, placaV.getDime().getLargura());
            stmt.setFloat(12, placaV.getDime().getEspessura());
            stmt.setString(13, placaV.getDataGarantia());
            stmt.setString(14, marcaAntiga);
            stmt.setString(15, modeloAntigo);

            stmt.executeUpdate();

            if (stmt != null) {
                JOptionPane.showMessageDialog(
                        null,
                        "PlacaDeVideo Alterada Com sucesso"
                );
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(
                    null,
                    "Erro ao Alterar: " + ex
            );
        } finally {
            ConnectionBanco.closeConnection(con, stmt);
        }

    }

    public PlacaDeVideo consPlacaV(String marca, String modelo) {
        Connection con = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;

        try {
            con = ConnectionBanco.getConnection();
            stmt = con.prepareStatement("SELECT * FROM PlacaDeVideo WHERE marca = ? AND modelo = ?");
            stmt.setString(1, marca);
            stmt.setString(2, modelo);

            rs = stmt.executeQuery();

            if (rs.next()) { // Só entra se houver resultado
                placaV = new PlacaDeVideo();
                try {
                    placaV.setMarca(rs.getString("marca").toUpperCase());
                    placaV.setModelo(rs.getString("modelo").toUpperCase());
                    try {
                        placaV.setAno(rs.getInt("ano"));
                    } catch (AnoInvException ex) {
                        Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    try {
                        placaV.setPreco(rs.getFloat("preco"));
                    } catch (PrecoInvException ex) {
                        Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    try {
                        placaV.setMemoria(rs.getInt("memoria"));
                    } catch (MemoriaInvException mie) {
                        JOptionPane.showMessageDialog(
                                null,
                                mie.getMessage(),
                                "ERRO",
                                ERROR_MESSAGE
                        );
                    } catch (NumberFormatException nfe) {
                        JOptionPane.showMessageDialog(
                                null,
                                "[ERRO] Por Favor digite um numero inteiro.",
                                "ERRO",
                                ERROR_MESSAGE
                        );
                    }

                    try {
                        placaV.setVeloVram(rs.getFloat("veloVram"));
                    } catch (VeloVramException vve) {
                        JOptionPane.showMessageDialog(
                                null,
                                vve.getMessage(),
                                "ERRO",
                                ERROR_MESSAGE
                        );

                    } catch (NumberFormatException nfe) {
                        JOptionPane.showMessageDialog(
                                null,
                                "[ERRO] Por Favor digite um numero flutuante.",
                                "ERRO",
                                ERROR_MESSAGE
                        );
                    }
                    try {
                        placaV.setTipoMemoria(rs.getString("tipoMemoria"));
                    } catch (TipoMenInvException tmie) {
                        JOptionPane.showMessageDialog(
                                null,
                                tmie.getMessage(),
                                "ERRO",
                                ERROR_MESSAGE
                        );

                    }

                    try {
                        placaV.setNumPci(rs.getFloat("numPci"));
                    } catch (NumPciException npe) {
                        JOptionPane.showMessageDialog(
                                null,
                                npe.getMessage(),
                                "ERRO",
                                ERROR_MESSAGE
                        );
                    } catch (NumberFormatException nfe) {
                        JOptionPane.showMessageDialog(
                                null,
                                "[ERRO] Por Favor digite um numero flutuante.",
                                "ERRO",
                                ERROR_MESSAGE
                        );
                    }

                    placaV.setSaidaVideo(rs.getString("saidaVideo"));

                    try {
                        placaV.getDime().setComprimento(rs.getFloat("comprimento"));
                    } catch (NumberFormatException nfe) {
                        JOptionPane.showMessageDialog(
                                null,
                                "[ERRO] Por Favor digite um numero flutuante.",
                                "ERRO",
                                ERROR_MESSAGE
                        );
                    }

                    try {
                        placaV.getDime().setLargura(rs.getFloat("largura"));
                    } catch (NumberFormatException nfe) {
                        JOptionPane.showMessageDialog(
                                null,
                                "[ERRO] Por Favor digite um numero flutuante.",
                                "ERRO",
                                ERROR_MESSAGE
                        );
                    }

                    try {
                        placaV.getDime().setEspessura(rs.getFloat("espessura"));
                    } catch (NumberFormatException nfe) {
                        JOptionPane.showMessageDialog(
                                null,
                                "[ERRO] Por Favor digite um numero flutuante.",
                                "ERRO",
                                ERROR_MESSAGE
                        );
                    }

                    placaV.setDataGarantia(rs.getString("data_Garantia"));
                } catch (ProcInvException | PlacaVidInvException | PlacaMaeInvException | ProcModInvException ex) {
                    JOptionPane.showMessageDialog(null, ex.getMessage(), "ERRO", JOptionPane.ERROR_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(null, "Placa De Video não encontrad.");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao buscar: " + ex);
        } finally {
            ConnectionBanco.closeConnection(con, stmt, rs);
        }

        return placaV;
    }

    public void removePlacaV(PlacaDeVideo placaV) {

        Connection con = ConnectionBanco.getConnection();
        PreparedStatement stmt = null;

        try {

            stmt = con.prepareStatement("DELETE FROM PlacaDeVideo WHERE marca = ? AND modelo = ?");
            stmt.setString(1, placaV.getMarca().toUpperCase());
            stmt.setString(2, placaV.getModelo().toUpperCase());
            stmt.executeUpdate();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(
                    null,
                    "Erro ao Remover: " + ex
            );
        } finally {
            ConnectionBanco.closeConnection(con, stmt);
        }
    }

    //SEÇÃO PLACA MÃE
    public void createPlacaM(PlacaMae placaM) {

        Connection con = ConnectionBanco.getConnection();
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("INSERT INTO PlacaMae(marca,modelo,ano,preco,numMemoria,gerMemRam,pciCompativel,tamanho,data_Garantia)VALUES(?,?,?,?,?,?,?,?,?)");
            stmt.setString(1, placaM.getMarca());
            stmt.setString(2, placaM.getModelo());
            stmt.setInt(3, placaM.getAno());
            stmt.setFloat(4, placaM.getPreco());
            stmt.setInt(5, placaM.getNumMemoria());
            stmt.setString(6, placaM.getGerMemRam());
            stmt.setFloat(7, placaM.getPciCompativel());
            stmt.setString(8, placaM.getTamanho());
            stmt.setString(9, placaM.getDataGarantia());

            stmt.executeUpdate();

            if (stmt != null) {
                JOptionPane.showMessageDialog(
                        null,
                        "Placa Mãe Salva Com sucesso"
                );

            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(
                    null,
                    "Erro ao Salvar: " + ex
            );
        } finally {
            ConnectionBanco.closeConnection(con, stmt);
        }

    }

    public List<PlacaMae> readPlacaM() {

        Connection con = ConnectionBanco.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<PlacaMae> placasMae = new ArrayList<>();

        try {
            stmt = con.prepareStatement("SELECT * FROM PlacaMae");
            rs = stmt.executeQuery();

            while (rs.next()) {
                placaM = new PlacaMae();
                try {
                    placaM.setMarca(rs.getString("marca"));
                    placaM.setModelo(rs.getString("modelo"));
                } catch (ProcInvException | PlacaVidInvException | PlacaMaeInvException | ProcModInvException pie) {
                    JOptionPane.showMessageDialog(
                            null,
                            pie.getMessage(),
                            "ERRO",
                            ERROR_MESSAGE
                    );
                }
                try {
                    placaM.setAno(rs.getInt("ano"));
                } catch (AnoInvException aie) {
                    JOptionPane.showMessageDialog(
                            null,
                            aie.getMessage(),
                            "ERRO",
                            ERROR_MESSAGE
                    );
                } catch (NumberFormatException nfe) {
                    JOptionPane.showMessageDialog(
                            null,
                            "[ERRO] Por Favor digite um numero inteiro EX: 2015",
                            "ERRO",
                            ERROR_MESSAGE
                    );
                }
                try {
                    placaM.setPreco(rs.getFloat("preco"));
                } catch (PrecoInvException pie) {
                    JOptionPane.showMessageDialog(
                            null,
                            pie.getMessage(),
                            "ERRO",
                            ERROR_MESSAGE
                    );
                } catch (NumberFormatException nfe) {
                    JOptionPane.showMessageDialog(
                            null,
                            "[ERRO] Por Favor digite um numero inteiro EX: 2015",
                            "ERRO",
                            ERROR_MESSAGE
                    );
                }
                try {
                    placaM.setNumMemoria(rs.getInt("numMemoria"));
                } catch (NumMemoriaException nme) {
                    JOptionPane.showMessageDialog(
                            null,
                            nme.getMessage(),
                            "ERRO",
                            ERROR_MESSAGE
                    );
                } catch (NumberFormatException nfe) {
                    JOptionPane.showMessageDialog(
                            null,
                            "[ERRO] Por Favor digite um numero inteiro",
                            "ERRO",
                            ERROR_MESSAGE
                    );
                }

                try {
                    placaM.setGerMemRam(rs.getString("gerMemRam"));
                } catch (GerMemRamException gmre) {
                    JOptionPane.showMessageDialog(
                            null,
                            gmre.getMessage(),
                            "ERRO",
                            ERROR_MESSAGE
                    );

                }

                try {
                    placaM.setPciCompativel(rs.getFloat("pciCompativel"));
                } catch (PciCompInvException pcie) {
                    JOptionPane.showMessageDialog(
                            null,
                            pcie.getMessage(),
                            "ERRO",
                            ERROR_MESSAGE
                    );

                }

                try {
                    placaM.setTamanho(rs.getString("tamanho"));
                } catch (TamanhoInvException tie) {
                    JOptionPane.showMessageDialog(
                            null,
                            tie.getMessage(),
                            "ERRO",
                            ERROR_MESSAGE
                    );
                }

                placaM.setDataGarantia(rs.getString("data_Garantia"));
                placasMae.add(placaM);
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(
                    null,
                    "ERRO: " + ex
            );
        } finally {
            ConnectionBanco.closeConnection(con, stmt, rs);
        }
        return placasMae;
    }

    public void updatePlacaM(PlacaMae placaM, String marcaAntiga, String modeloAntigo) {

        Connection con = ConnectionBanco.getConnection();
        PreparedStatement stmt = null;

        try {

            stmt = con.prepareStatement("UPDATE PlacaDeVideo SET marca = ?,modelo = ?,ano = ?,preco = ?,numMemoria = ?, gerMemRam = ?,  "
                    + "pciCompativel = ?, tamanho = ?, data_Garantia = ? WHERE marca = ?  AND modelo = ?");
            stmt.setString(1, placaM.getMarca());
            stmt.setString(2, placaM.getModelo());
            stmt.setInt(3, placaM.getAno());
            stmt.setFloat(4, placaM.getPreco());
            stmt.setInt(5, placaM.getNumMemoria());
            stmt.setString(6, placaM.getGerMemRam());
            stmt.setFloat(7, placaM.getPciCompativel());
            stmt.setString(8, placaM.getTamanho());
            stmt.setString(9, placaM.getDataGarantia());
            stmt.setString(10, marcaAntiga);
            stmt.setString(11, modeloAntigo);

            stmt.executeUpdate();

            if (stmt != null) {
                JOptionPane.showMessageDialog(
                        null,
                        "Placa Mãe Alterada Com sucesso"
                );
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(
                    null,
                    "Erro ao Alterar: " + ex
            );
        } finally {
            ConnectionBanco.closeConnection(con, stmt);
        }

    }

    public PlacaMae consPlacaM(String marca, String modelo) {
        Connection con = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;

        try {
            con = ConnectionBanco.getConnection();
            stmt = con.prepareStatement("SELECT * FROM PlacaMae WHERE marca = ? AND modelo = ?");
            stmt.setString(1, marca);
            stmt.setString(2, modelo);

            rs = stmt.executeQuery();

            if (rs.next()) { // Só entra se houver resultado
                placaM = new PlacaMae();
                try {
                    placaM.setMarca(rs.getString("marca"));
                    placaM.setModelo(rs.getString("modelo"));
                    try {
                        placaM.setAno(rs.getInt("ano"));
                    } catch (AnoInvException aie) {
                        JOptionPane.showMessageDialog(
                                null,
                                aie.getMessage(),
                                "ERRO",
                                ERROR_MESSAGE
                        );
                    }
                    try {
                        placaM.setPreco(rs.getFloat("preco"));
                    } catch (PrecoInvException pie) {
                        JOptionPane.showMessageDialog(
                                null,
                                pie.getMessage(),
                                "ERRO",
                                ERROR_MESSAGE
                        );
                    }
                    try {
                        placaM.setNumMemoria(rs.getInt("numMemoria"));
                    } catch (NumMemoriaException nme) {
                        JOptionPane.showMessageDialog(
                                null,
                                nme.getMessage(),
                                "ERRO",
                                ERROR_MESSAGE
                        );
                    } catch (NumberFormatException nfe) {
                        JOptionPane.showMessageDialog(
                                null,
                                "[ERRO] Por Favor digite um numero inteiro",
                                "ERRO",
                                ERROR_MESSAGE
                        );
                    }

                    try {
                        placaM.setGerMemRam(rs.getString("gerMemRam"));
                    } catch (GerMemRamException gmre) {
                        JOptionPane.showMessageDialog(
                                null,
                                gmre.getMessage(),
                                "ERRO",
                                ERROR_MESSAGE
                        );

                    }

                    try {
                        placaM.setPciCompativel(rs.getFloat("pciCompativel"));
                    } catch (PciCompInvException pcie) {
                        JOptionPane.showMessageDialog(
                                null,
                                pcie.getMessage(),
                                "ERRO",
                                ERROR_MESSAGE
                        );

                    }

                    try {
                        placaM.setTamanho(rs.getString("tamanho"));
                    } catch (TamanhoInvException tie) {
                        JOptionPane.showMessageDialog(
                                null,
                                tie.getMessage(),
                                "ERRO",
                                ERROR_MESSAGE
                        );
                    }

                    placaM.setDataGarantia(rs.getString("data_Garantia"));
                } catch (ProcInvException | PlacaVidInvException | PlacaMaeInvException | ProcModInvException ex) {
                    JOptionPane.showMessageDialog(null, ex.getMessage(), "ERRO", JOptionPane.ERROR_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(null, "Placa Mãe não encontrada.");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao buscar: " + ex);
        } finally {
            ConnectionBanco.closeConnection(con, stmt, rs);
        }

        return placaM;
    }

    public void removePlacaM(PlacaMae placaM) {

        Connection con = ConnectionBanco.getConnection();
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("DELETE FROM PlacaMae WHERE marca = ?  AND modelo = ?");
            stmt.setString(1, placaV.getMarca());
            stmt.setString(2, placaV.getModelo());
            stmt.executeUpdate();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(
                    null,
                    "Erro ao Remover: " + ex
            );
        } finally {
            ConnectionBanco.closeConnection(con, stmt);
        }

    }

}