import java.lang.management.ManagementFactory;
import com.sun.management.OperatingSystemMXBean;

public class SystemResourceMonitor {
    public static void main(String[] args) {
        OperatingSystemMXBean osBean =(OperatingSystemMXBean) ManagementFactory.getOperatingSystemMXBean();

        //Get total CPU load and total physical memory
        double cpuLoad = osBean.getCpuLoad() * 100;
        long totalMemory = osBean.getTotalMemorySize();
        long freeMemory = osBean.getFreeMemorySize();

        System.out.printf("CPU load: %.2f%%%n", cpuLoad);
        System.out.printf("Total memory: %dMB%n", totalMemory / 1048576);
        System.out.printf("Free memory: %dMB%n", freeMemory / 1048576);

    }
}
