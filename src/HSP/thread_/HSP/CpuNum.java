package HSP.thread_.HSP;

/**
 * @author AMAO
 * @version 1.0
 * @date Created in 2022/5/10 10:38
 */

public class CpuNum {
    public static void main(String[] args) {

        Runtime runtime = Runtime.getRuntime();
        int cpuNum = runtime.availableProcessors();
        System.out.println(cpuNum);
    }
}
