package Window;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


@SuppressWarnings({ "serial" })
public class Otherwin extends JFrame{
	/**
	 * �������巽��
	 * */
	void Sign() {
		JFrame sign=new JFrame("����");//������������
		sign.setResizable(false);
		sign.setSize(500, 700);
		sign.setLayout(null);
		Dimension size = getToolkit().getScreenSize();// �����Ļ�ߴ�
		sign.setLocation((size.width - 500) / 2, (size.height - 700) / 2);// ���ô��嵯��λ��
		Container cc=sign.getContentPane();//��ȡ����
		cc.setBackground(new Color(240,240,240));
		JLabel jl=new JLabel("��������");
		jl.setBounds(180, 0, 200, 50);
		jl.setFont(new Font("",1,30));
		JButton bi=new JButton("��ʼ��Ϸ");//���ð�ť
		
		cc.add(jl);
		String s="       ����Ϸ����ѧϰ�����֣�����ʹ�á�������κ��ˣ��������غ�24Сʱ֮��ж�أ����������һ�к������е���"
				+"���ڱ���ˮƽ���ޣ���֮ʱ��ִ٣����ܻ���һЩ���������½⡣�������һЩ����ͽ��飬�뷢���ҵĵ�������\'\'ws_wanghe@163.com\'\'��"
				+ "\n\t\t������\n\t\t2018-08-08";//����������
		JTextArea jt=new JTextArea(s);//�����ı������
		jt.setFont(new Font("",0,20));//�����ı��������
		jt.setEditable(false);//���ô��岻������
		jt.setLineWrap(true);//�����Զ�����
		jt.setBounds(45,75,400,400);
		cc.add(jt);//���ı��������������
		sign.setVisible(true);//�Ǵ���ɼ�
		bi.setBounds(190, 550, 100, 50);
		cc.add(bi);//����ť�����������
		bi.addActionListener(new ActionListener() {
			//Ϊ��ť�����굥���¼�
			@Override
			public void actionPerformed(ActionEvent arg0) {
				JFrame login = new LoginDialog();//ʵ������¼�������
				login.setResizable(false);
				login.setVisible(true);// ʹ��¼����ɼ�
				sign.setVisible(false);//���������ڲ��ɼ�
				
			}
		});
		//Ϊ�ı�����Ӽ����¼�
		jt.addKeyListener(new KeyListener() {
			
			@Override
			public void keyTyped(KeyEvent e) {
				
				if(e.getKeyChar()=='\n') {//�ж��Ƿ�Ϊ�س���
					JFrame login = new LoginDialog();//ʵ������¼�������
					login.setVisible(true);// ʹ��¼����ɼ�
					sign.setVisible(false);//���������ڲ��ɼ�
				}
			}

			@Override
			public void keyReleased(KeyEvent e) {
				
				
			}

			@Override
			public void keyPressed(KeyEvent e) {
				
				
			}
			
			
		});
		sign.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);//���ô��ڹرշ�ʽ
		System.out.println("��������������");
		
	}
	/**
	 * �����Ի��򷽷�
	 * */
	void communicate(String display) {
		//���ñ��⣬�����壬����
		JDialog jd=new JDialog(MainFrame.mainframe,"���ϼ���������",true);
		jd.setLayout(null);//ʹ�þ��Բ��ֹ�����
		jd.setResizable(false);
		Container cc=jd.getContentPane();//��ȡ����
		Dimension size = getToolkit().getScreenSize();
		jd.setLocation((size.width-300)/2, (size.height-180)/2);//���öԻ��򵯳�λ��
		jd.setSize(300, 180);//���öԻ����С
		JLabel jl=new JLabel(display);
		jl.setFont(new Font("",0,20));
		int a=jl.getText().length();
		jl.setBounds(135-(a*18)/2, 18, 200, 80);//�����־���
		cc.add(jl);//����ǩ�����������
		JButton jb=new JButton("ȷ��");//���ð�ť
		jb.setBounds(90, 95, 100, 30);
		cc.setBackground(new Color(245,245,245));
		cc.add(jb);//����ť�����������
		//Ϊ��ť�����굥���¼�
		jb.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				jd.setVisible(false);//���ضԻ���
				
			}
		});
		System.out.println("�Ի��򵯳�������");
		jd.setVisible(true);//ʹ�Ի���ɼ�
	}

}
