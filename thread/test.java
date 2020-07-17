package thread;

class PC {
	
	CPU cpu;
	HardDisk HD;
	
	public void setCpu(CPU cpu) {
		this.cpu = cpu;
	}

	
	public void setHD(HardDisk hD) {
		HD = hD;
	}
	
	public void show() {
		System.out.println("CPU的速度："+cpu.speed+"   硬盘的容量："+HD.amount);
	}
}

class CPU{

	int speed;
	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}
}

 
class HardDisk{
	int amount;
	public int getAmount() {
		return amount;
	}
	
	
	public void setAmount(int amount) {
		this.amount = amount;
	}
}

 

public class test {

	public static void main(String[] args) {

		CPU cpu = new CPU();

		cpu.setSpeed(2200);

		HardDisk disk = new HardDisk();

		disk.setAmount(200);

		PC pc = new PC();

		pc.setCpu(cpu);

		pc.setHD(disk);

		pc.show();

	}

}
