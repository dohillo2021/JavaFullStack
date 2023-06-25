package cursojava.thread;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TelaTimeThread extends JDialog{

	private JPanel jPanel = new JPanel(new GridBagLayout());/*Painel de componentes*/
	
	private JLabel descricaoHora = new JLabel("Nome");
	
	private JTextField mostraTempo = new JTextField();/*só niciando o objeto*/
	
	private JLabel descricaoHora2 = new JLabel("E-mail");
	
	private JTextField mostraTempo2 = new JTextField();/*só niciando o objeto*/
	
	private JButton jButton = new JButton("Add Lista");
	private JButton jButton2 = new JButton("Stop");
	
	
	private ImplementacaoFilaThread fila = new ImplementacaoFilaThread();/*Instanciando uma fila, inicializando objeto fila. Quando essa tela inicia já vai ter essa fila instanciado dentro*/
	
	
	
	public TelaTimeThread() {/*1 construtor executa o que tiver dentro no momento da abertura ou execucao*/
		setTitle("Minha tela de time com thread");
		setSize(new Dimension(240, 240));
		setLocationRelativeTo(null);
		setResizable(false);
		/*Primeira parte concluída*/
		
		GridBagConstraints gridBagConstraints = new GridBagConstraints();/*Gerenciador controlador de posicionamento de componentes*/
		gridBagConstraints.gridx = 0;
		gridBagConstraints.gridy = 0;
		gridBagConstraints.gridwidth = 2;
		gridBagConstraints.insets = new Insets(5, 10, 5, 5);
		gridBagConstraints.anchor = GridBagConstraints.WEST;
		
		
		descricaoHora.setPreferredSize(new Dimension(200, 25));
		jPanel.add(descricaoHora, gridBagConstraints);/*colocando dentro do painel adicionando*/
		
		mostraTempo.setPreferredSize(new Dimension(200, 25));
		gridBagConstraints.gridy ++;
		jPanel.add(mostraTempo, gridBagConstraints);
		
		descricaoHora2.setPreferredSize(new Dimension(200, 25));
		gridBagConstraints.gridy ++;
		jPanel.add(descricaoHora2, gridBagConstraints);
		
		mostraTempo2.setPreferredSize(new Dimension(200, 25));
		gridBagConstraints.gridy ++;
		jPanel.add(mostraTempo2, gridBagConstraints);
		
		gridBagConstraints.gridwidth = 1;
		
		jButton.setPreferredSize(new Dimension(92, 25));
		gridBagConstraints.gridy ++;
		jPanel.add(jButton, gridBagConstraints);
		
		jButton2.setPreferredSize(new Dimension(92, 25));
		gridBagConstraints.gridx ++;
		jPanel.add(jButton2, gridBagConstraints);
		
		jButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {/*Executa o click no botão*/
				
				if (fila == null) {
					fila = new ImplementacaoFilaThread();
					fila.start();
				}
				
				for (int qtd = 0; qtd < 100; qtd++) {/*Simulando 100 envios em massa*/
					ObjetoFilaThread filaThread = new ObjetoFilaThread();
					filaThread.setNome(mostraTempo.getText());
					filaThread.setEmail(mostraTempo2.getText() + " - "+ qtd);
					
					fila.add(filaThread);
				}
			}
		});
		
		jButton2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				fila.stop();
				fila = null;
				
			}
		});
		
		fila.start();
		add(jPanel, BorderLayout.WEST);/*painel sendo colocado no Diolog, sem essa linha não aparece nada comente pra testar*/
		
		/*sempre será o último comando, porque ele vai executar tudo que estiver dentro do construtor*/
		setVisible(true);/*Torna a tela visível para o usuário*/
	}
	
}
