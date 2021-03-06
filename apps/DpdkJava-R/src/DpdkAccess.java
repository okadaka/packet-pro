// Contains native methods to connect to C native DPDK libraries

public class DpdkAccess {
	
	private static native int nat_init_eal();
	private static native int nat_create_mempool(String name, int num_el, int cache_size, int socket_id);
	private static native int nat_check_ports();
	private static native int nat_configure_dev(int port_id, int rx_num, int tx_num);
	private static native int nat_configure_rx_queue(int port_id, int rx_id, int socket_id);
	private static native int nat_configure_tx_queue(int port_id, int tx_id, int socked_id);
	private static native int nat_dev_start(int port_id);
	private static native String nat_check_ports_link_status();

	private static native void nat_receive_burst(long pointer, int port_id, int rx_id);
	private static native void nat_free_packets(long pointer);
	private static native void nat_send_packets(long pointer, int port_id, int tx_id);
	private static native void nat_free_packet(long pointer);
	
	private static native void nat_set_receive_burst(int value);
	private static native void nat_set_program_name(String value);
	private static native void nat_set_memory_channels(String value);
	private static native void nat_set_memory(String value);
	private static native void nat_set_program_id(String value);
	private static native void nat_set_blacklist(String[] value);
	private static native int nat_set_thread_affinity(int core);

	private static native void nat_enable_pro();
	
	private static native String nat_get_mac_info();
	
	private static native void nat_start_stats();
	
	static {
		System.loadLibrary("nat_dpdk");
	}
	
	public static void dpdk_start_stats() {
		nat_start_stats();
	}

	public static void dpdk_enable_pro() {
		nat_enable_pro();
	}
	
	public static int dpdk_init_eal() {
		return nat_init_eal();
	}
	
	public static int dpdk_create_mempool(String name, int num_el, int cache_size, int socket_id) {
		return nat_create_mempool(name, num_el, cache_size, socket_id);
	}
	
	public static int dpdk_check_ports() {
		return nat_check_ports();
	}
	
	public static int dpdk_configure_dev(int port_id, int rx_num, int tx_num) {
		return nat_configure_dev(port_id, rx_num, tx_num);
	}
	
	public static int dpdk_configure_rx_queue(int port_id, int rx_id, int socket_id) {
		return nat_configure_rx_queue(port_id, rx_id, socket_id);
	}
	
	public static int dpdk_configure_tx_queue(int port_id, int tx_id, int socked_id) {
		return nat_configure_tx_queue(port_id, tx_id, socked_id);
	}
	
	public static int dpdk_dev_start(int port_id) {
		return nat_dev_start(port_id);
	}
	
	public static String dpdk_check_ports_link_status() {
		return nat_check_ports_link_status();
	}
	
	public static void dpdk_receive_burst(long pointer, int port_id, int rx_id) {
		nat_receive_burst(pointer, port_id, rx_id);
	}
	
	public static void dpdk_free_packets(long pointer) {
		nat_free_packets(pointer);
	}
	
	public static void dpdk_send_packets(long pointer, int port_id, int tx_id) {
		nat_send_packets(pointer, port_id, tx_id);
	}
	
	public static void dpdk_set_receive_burst(int value) {
		nat_set_receive_burst(value);
	}
	
	public static void dpdk_set_program_name(String value) {
		nat_set_program_name(value);
	}
	
	public static void dpdk_set_memory_channels(String value) {
		nat_set_memory_channels(value);
	}
	
	public static void dpdk_set_memory(String value) {
		nat_set_memory(value);
	}
	
	public static void dpdk_set_program_id(String value) {
		nat_set_program_id(value);
	}
	
	public static void dpdk_set_blacklist(String[] value) {
		nat_set_blacklist(value);
	}
	
	public static int set_thread_affinity(int core) {
		return nat_set_thread_affinity(core);
	}
	
	public static String dpdk_get_mac_info() {
		return nat_get_mac_info();
	}
	
	public static void dpdk_free_packet(long pointer) {
		nat_free_packet(pointer);
	}
	
}
