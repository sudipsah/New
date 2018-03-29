package hell;

	import java.net.*;
	import java.io.*;

	public class URLConnectionReader {
	    public static void main(String[] args) throws Exception {
	        URL oracle = new URL("https://www.amazon.com/gp/product/B01M7XPGYE/ref=s9_acsd_simh_bw_c_x_1_w?pf_rd_m=ATVPDKIKX0DER&pf_rd_s=merchandised-search-3&pf_rd_r=8TT2C3YB2DCQ41F7DS9P&pf_rd_r=8TT2C3YB2DCQ41F7DS9P&pf_rd_t=101&pf_rd_p=fe185ec9-c8f5-44c0-897e-4c0bde93268c&pf_rd_p=fe185ec9-c8f5-44c0-897e-4c0bde93268c&pf_rd_i=283155");
	        URLConnection yc = oracle.openConnection();
	        BufferedReader in = new BufferedReader(new InputStreamReader(
	                                    yc.getInputStream()));
	        String inputLine;
	        while ((inputLine = in.readLine()) != null) 
	            System.out.println(inputLine);
	        in.close();
	    }
	}

