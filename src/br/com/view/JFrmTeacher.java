package br.com.view;

import br.com.DAO.Teacher_DAO;
import br.com.model.Teacher;
import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author Kauai Guarilha
 */
public class JFrmTeacher extends javax.swing.JFrame {

    
    private int xMouse;
    private int yMouse;
    
    
    public JFrmTeacher() {
        initComponents();   
        this.setLocationRelativeTo(this);
        setBackground(new Color(0,0,0,0));
        
        this.Stu_Sidebar.setBackground(new Color(51,51,51));
        this.Stu_Parent.setBackground(new Color(0,0,0,0));     
        
        this.Stu_Parent.setVisible(true);    
        
        DefaultTableModel modelo = (DefaultTableModel) jtable_professor.getModel();
        
        jtable_professor.setRowSorter(new TableRowSorter(modelo));
        
        readTabla_professor();
        
    }
    
    public void readTabla_professor(){
        DefaultTableModel modelo = (DefaultTableModel) jtable_professor.getModel();
        Teacher_DAO teacher_dao = new Teacher_DAO();
        
        modelo.setNumRows(0);
        
        for(Teacher teacher: teacher_dao.read()){
            modelo.addRow(new Object[]{
            
                teacher.getId(),
                teacher.getNome(),
                teacher.getEmail(),
                teacher.getCpf(),
                teacher.getTelefone(),
                teacher.getCidade(),
                teacher.getEstado(),
                teacher.getEndereco(),
                teacher.getComplemento(),
                teacher.getLogradouro(),
                teacher.getNumero()       
            });
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Stu_Parent = new javax.swing.JPanel();
        Stu_Sidebar = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        Stu_Content = new javax.swing.JPanel();
        lb_name = new javax.swing.JLabel();
        txt_fullName = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        txt_email = new javax.swing.JTextField();
        lb_email = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jformat_telefone = new javax.swing.JFormattedTextField();
        jLabel3 = new javax.swing.JLabel();
        jformat_cpf = new javax.swing.JFormattedTextField();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator8 = new javax.swing.JSeparator();
        jSeparator9 = new javax.swing.JSeparator();
        jSeparator10 = new javax.swing.JSeparator();
        jSeparator11 = new javax.swing.JSeparator();
        jLabel10 = new javax.swing.JLabel();
        txt_cidade = new javax.swing.JTextField();
        txt_endereco = new javax.swing.JTextField();
        txt_complemento = new javax.swing.JTextField();
        txt_logradouro = new javax.swing.JTextField();
        txt_numeroEnd = new javax.swing.JTextField();
        jcombo_estado = new javax.swing.JComboBox<Object>();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtable_professor = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        setUndecorated(true);

        Stu_Sidebar.setBackground(new java.awt.Color(51, 51, 51));
        Stu_Sidebar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Stu_Stu_SidebarMousePressed(evt);
            }
        });
        Stu_Sidebar.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                Stu_Stu_SidebarMouseDragged(evt);
            }
        });
        Stu_Sidebar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/resources/icons8_School_Director_24px.png"))); // NOI18N
        jLabel4.setText(" Teacher");
        Stu_Sidebar.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 60, -1, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/resources/icons8_Back_24px.png"))); // NOI18N
        jLabel1.setText("Return");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel1MousePressed(evt);
            }
        });
        Stu_Sidebar.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        Stu_Content.setBackground(new java.awt.Color(0, 0, 0));

        lb_name.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lb_name.setForeground(new java.awt.Color(255, 255, 255));
        lb_name.setText("Name");

        txt_fullName.setBackground(new java.awt.Color(0, 0, 0));
        txt_fullName.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txt_fullName.setForeground(new java.awt.Color(255, 255, 255));
        txt_fullName.setBorder(null);
        txt_fullName.setCaretColor(new java.awt.Color(255, 255, 255));

        txt_email.setBackground(new java.awt.Color(0, 0, 0));
        txt_email.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txt_email.setForeground(new java.awt.Color(255, 255, 255));
        txt_email.setBorder(null);
        txt_email.setCaretColor(new java.awt.Color(255, 255, 255));

        lb_email.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lb_email.setForeground(new java.awt.Color(255, 255, 255));
        lb_email.setText("E-mail");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Phone");

        jformat_telefone.setBackground(new java.awt.Color(0, 0, 0));
        jformat_telefone.setBorder(null);
        jformat_telefone.setForeground(new java.awt.Color(255, 255, 255));
        try {
            jformat_telefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)#####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jformat_telefone.setCaretColor(new java.awt.Color(255, 255, 255));
        jformat_telefone.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jformat_telefone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jformat_telefoneActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("CPF");

        jformat_cpf.setBackground(new java.awt.Color(0, 0, 0));
        jformat_cpf.setBorder(null);
        jformat_cpf.setForeground(new java.awt.Color(255, 255, 255));
        try {
            jformat_cpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jformat_cpf.setCaretColor(new java.awt.Color(255, 255, 255));
        jformat_cpf.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Endereço");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Logradouro");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Complemento");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Numero");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Cidade");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Estado");

        txt_cidade.setBackground(new java.awt.Color(0, 0, 0));
        txt_cidade.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txt_cidade.setForeground(new java.awt.Color(255, 255, 255));
        txt_cidade.setBorder(null);
        txt_cidade.setCaretColor(new java.awt.Color(255, 255, 255));

        txt_endereco.setBackground(new java.awt.Color(0, 0, 0));
        txt_endereco.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txt_endereco.setForeground(new java.awt.Color(255, 255, 255));
        txt_endereco.setBorder(null);
        txt_endereco.setCaretColor(new java.awt.Color(255, 255, 255));

        txt_complemento.setBackground(new java.awt.Color(0, 0, 0));
        txt_complemento.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txt_complemento.setForeground(new java.awt.Color(255, 255, 255));
        txt_complemento.setBorder(null);
        txt_complemento.setCaretColor(new java.awt.Color(255, 255, 255));

        txt_logradouro.setBackground(new java.awt.Color(0, 0, 0));
        txt_logradouro.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txt_logradouro.setForeground(new java.awt.Color(255, 255, 255));
        txt_logradouro.setBorder(null);
        txt_logradouro.setCaretColor(new java.awt.Color(255, 255, 255));

        txt_numeroEnd.setBackground(new java.awt.Color(0, 0, 0));
        txt_numeroEnd.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txt_numeroEnd.setForeground(new java.awt.Color(255, 255, 255));
        txt_numeroEnd.setBorder(null);
        txt_numeroEnd.setCaretColor(new java.awt.Color(255, 255, 255));

        jcombo_estado.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jcombo_estado.setForeground(new java.awt.Color(0, 0, 0));
        jcombo_estado.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "AC", "AL", "AM", "AP", "BA", "CE", "DF", "ES", "GO", "MA", "MT", "MS", "MG", "PA", "PB", "PR", "PE", "PI", "RN", "RS", "RJ", "RO", "RR", "SC", "SP", "SE" }));
        jcombo_estado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcombo_estadoActionPerformed(evt);
            }
        });

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/resources/icons8_Add_File_50px.png"))); // NOI18N
        jLabel11.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel11MousePressed(evt);
            }
        });

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/resources/icons8_Delete_File_45px.png"))); // NOI18N
        jLabel12.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel12MousePressed(evt);
            }
        });

        javax.swing.GroupLayout Stu_ContentLayout = new javax.swing.GroupLayout(Stu_Content);
        Stu_Content.setLayout(Stu_ContentLayout);
        Stu_ContentLayout.setHorizontalGroup(
            Stu_ContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Stu_ContentLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(Stu_ContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Stu_ContentLayout.createSequentialGroup()
                        .addComponent(lb_name)
                        .addGap(18, 18, 18)
                        .addComponent(txt_fullName, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(Stu_ContentLayout.createSequentialGroup()
                        .addGroup(Stu_ContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(lb_email)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(Stu_ContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_email, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jformat_cpf, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(Stu_ContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jformat_telefone, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(53, 53, 53)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(Stu_ContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Stu_ContentLayout.createSequentialGroup()
                        .addGroup(Stu_ContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel7)
                            .addComponent(jLabel6)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(Stu_ContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_endereco)
                            .addComponent(txt_complemento)
                            .addComponent(txt_logradouro)))
                    .addGroup(Stu_ContentLayout.createSequentialGroup()
                        .addGroup(Stu_ContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(Stu_ContentLayout.createSequentialGroup()
                                .addGap(56, 56, 56)
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(Stu_ContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jSeparator9, javax.swing.GroupLayout.DEFAULT_SIZE, 261, Short.MAX_VALUE)
                                    .addComponent(jSeparator6, javax.swing.GroupLayout.DEFAULT_SIZE, 261, Short.MAX_VALUE)
                                    .addComponent(jSeparator8, javax.swing.GroupLayout.DEFAULT_SIZE, 261, Short.MAX_VALUE)
                                    .addComponent(jSeparator10, javax.swing.GroupLayout.DEFAULT_SIZE, 261, Short.MAX_VALUE)
                                    .addComponent(txt_cidade)))
                            .addGroup(Stu_ContentLayout.createSequentialGroup()
                                .addGroup(Stu_ContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(Stu_ContentLayout.createSequentialGroup()
                                        .addGap(120, 120, 120)
                                        .addGroup(Stu_ContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jSeparator11)
                                            .addComponent(txt_numeroEnd, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE))
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel10)
                                        .addGap(42, 42, 42))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Stu_ContentLayout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel12)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                                .addGroup(Stu_ContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jcombo_estado, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING))))
                        .addGap(0, 3, Short.MAX_VALUE)))
                .addGap(96, 96, 96))
        );
        Stu_ContentLayout.setVerticalGroup(
            Stu_ContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Stu_ContentLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(Stu_ContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_name)
                    .addComponent(txt_fullName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Stu_ContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_email)
                    .addComponent(txt_email, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(Stu_ContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jformat_cpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(Stu_ContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Stu_ContentLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jLabel2))
                    .addGroup(Stu_ContentLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jformat_telefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(118, 118, 118))
            .addGroup(Stu_ContentLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(Stu_ContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(Stu_ContentLayout.createSequentialGroup()
                        .addGroup(Stu_ContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(Stu_ContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel9)
                                .addComponent(txt_cidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(Stu_ContentLayout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(13, 13, 13)
                        .addGroup(Stu_ContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(txt_endereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator9, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addGroup(Stu_ContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(txt_complemento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator8, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 13, 13)
                        .addGroup(Stu_ContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(txt_logradouro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator10, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(Stu_ContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(Stu_ContentLayout.createSequentialGroup()
                                .addGap(7, 7, 7)
                                .addComponent(txt_numeroEnd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSeparator11, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(Stu_ContentLayout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addGroup(Stu_ContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel10)
                                    .addComponent(jcombo_estado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(Stu_ContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel12))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jtable_professor.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jtable_professor.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jtable_professor.setForeground(new java.awt.Color(51, 51, 51));
        jtable_professor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Name", "E-mail", "CPF", "Phone", "Cidade", "Estado", "Endereço", "Complemento", "Logradouro", "Numero"
            }
        ));
        jtable_professor.setGridColor(new java.awt.Color(255, 255, 255));
        jtable_professor.setRowHeight(20);
        jtable_professor.setSelectionBackground(new java.awt.Color(102, 102, 102));
        jtable_professor.setSelectionForeground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setViewportView(jtable_professor);

        jScrollPane3.setViewportView(jScrollPane1);

        javax.swing.GroupLayout Stu_ParentLayout = new javax.swing.GroupLayout(Stu_Parent);
        Stu_Parent.setLayout(Stu_ParentLayout);
        Stu_ParentLayout.setHorizontalGroup(
            Stu_ParentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Stu_ParentLayout.createSequentialGroup()
                .addComponent(Stu_Sidebar, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Stu_ParentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Stu_Content, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane3)))
        );
        Stu_ParentLayout.setVerticalGroup(
            Stu_ParentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Stu_Sidebar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(Stu_ParentLayout.createSequentialGroup()
                .addComponent(Stu_Content, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Stu_Parent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Stu_Parent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Stu_Stu_SidebarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Stu_Stu_SidebarMousePressed

        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_Stu_Stu_SidebarMousePressed

    private void Stu_Stu_SidebarMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Stu_Stu_SidebarMouseDragged

        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();

        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_Stu_Stu_SidebarMouseDragged

    private void jLabel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MousePressed
       dispose();
       
    }//GEN-LAST:event_jLabel1MousePressed

    private void jformat_telefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jformat_telefoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jformat_telefoneActionPerformed

    private void jcombo_estadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcombo_estadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcombo_estadoActionPerformed

    private void jLabel11MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MousePressed
        
        Teacher teacher = new Teacher();
        Teacher_DAO teacher_dao = new Teacher_DAO();
        
        teacher.setNome(txt_fullName.getText());
        teacher.setEmail(txt_email.getText());
        teacher.setCpf(jformat_cpf.getText());
        teacher.setTelefone(jformat_telefone.getText());
        teacher.setCidade(txt_cidade.getText());    
        teacher.setEndereco(txt_endereco.getText());
        teacher.setComplemento(txt_complemento.getText());
        teacher.setLogradouro(txt_logradouro.getText());
        teacher.setNumero(Integer.parseInt(txt_numeroEnd.getText()));
        teacher.setEstado((String) jcombo_estado.getSelectedItem());
        
        teacher_dao.insert(teacher);
        
        txt_fullName.setText("");
        txt_email.setText("");
        jformat_cpf.setText("");
        jformat_telefone.setText("");
        txt_cidade.setText("");
        txt_endereco.setText("");
        txt_complemento.setText("");
        txt_logradouro.setText("");
        txt_numeroEnd.setText("");   
        jcombo_estado.setSelectedIndex(0);
        
        readTabla_professor();
    }//GEN-LAST:event_jLabel11MousePressed

    private void jLabel12MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MousePressed
       
        if(jtable_professor.getSelectedColumn() != -1){
            Teacher teacher = new Teacher();
            Teacher_DAO teacher_dao = new Teacher_DAO();
            
            teacher.setId((int) jtable_professor.getValueAt(jtable_professor.getSelectedRow(), 0));
            
            teacher_dao.delete(teacher);
            
            txt_fullName.setText("");
            txt_email.setText("");
            jformat_cpf.setText("");
            jformat_telefone.setText("");
            txt_cidade.setText("");
            txt_endereco.setText("");
            txt_complemento.setText("");
            txt_logradouro.setText("");
            txt_numeroEnd.setText("");   
            jcombo_estado.setSelectedIndex(0);
            
            readTabla_professor();
        }else{
            JOptionPane.showConfirmDialog(this, "Selecione um item para Excluir!");
        }
        
    }//GEN-LAST:event_jLabel12MousePressed
                   

    private void SidebarMousePressed(java.awt.event.MouseEvent evt) {                                     

        xMouse = evt.getX();
        yMouse = evt.getY();
    }                                    

    private void SidebarMouseDragged(java.awt.event.MouseEvent evt) {                                     

        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();

        this.setLocation(x - xMouse, y - yMouse);
    }                                    

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JFrmTeacher.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrmTeacher.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrmTeacher.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrmTeacher.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrmTeacher().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Stu_Content;
    private javax.swing.JPanel Stu_Parent;
    private javax.swing.JPanel Stu_Sidebar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JComboBox<Object> jcombo_estado;
    private javax.swing.JFormattedTextField jformat_cpf;
    private javax.swing.JFormattedTextField jformat_telefone;
    private javax.swing.JTable jtable_professor;
    private javax.swing.JLabel lb_email;
    private javax.swing.JLabel lb_name;
    private javax.swing.JTextField txt_cidade;
    private javax.swing.JTextField txt_complemento;
    private javax.swing.JTextField txt_email;
    private javax.swing.JTextField txt_endereco;
    private javax.swing.JTextField txt_fullName;
    private javax.swing.JTextField txt_logradouro;
    private javax.swing.JTextField txt_numeroEnd;
    // End of variables declaration//GEN-END:variables
}
