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
