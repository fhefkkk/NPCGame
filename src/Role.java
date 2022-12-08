import javax.swing.ImageIcon;

public class Role {
		int HP;
		int AGG;
		int DEN;
		ImageIcon image;
		String name;
		public Role(int HP,int AGG,int DEN) {
			this.HP=HP;
			this.AGG=AGG;
			this.DEN=DEN;
		}
	}
class A extends Role{

	public A(int process) {
		super(100+process*10,25+process*2,5+process);
		// TODO Auto-generated constructor stub
		switch(process) {
		case 0:
			this.name="A";
			this.image=new ImageIcon("#");
			break;
		case 1:
			this.name="B";
			this.image=new ImageIcon("#");
			break;
		case 2:
			this.name="C";
			this.image=new ImageIcon("#");
			break;
		case 3:
			this.name="D";
			this.image=new ImageIcon("#");
			break;
		}
	}
}
class B extends Role{
	public B(int process) {
		super(50+process*5,20+process*2,5+process);
		// TODO Auto-generated constructor stub
		switch(process) {
		case 0:
			this.name="1";
			this.image=new ImageIcon("#");
			break;
		case 1:
			this.name="2";
			this.image=new ImageIcon("#");
			break;
		case 2:
			this.name="3";
			this.image=new ImageIcon("#");
			break;
		case 3:
			this.name="4";
			this.image=new ImageIcon("#");
			break;
		}
	}
}
class DQL extends Role{
	public DQL() {
		super(250,1,-50);
		this.name="DQL";
		this.image=new ImageIcon("#");
	}
}
