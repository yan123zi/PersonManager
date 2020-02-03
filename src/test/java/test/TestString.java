package test;

import org.junit.Test;

import com.alibaba.fastjson.JSONObject;


public class TestString {
	static String s="http://localhost:8080/PersonManagementE:\\PersonManagement\\upload\\dc2b0949-0464-4f26-bbd1-66c2219fefd5.png";
	public static void main(String[] args) {
		System.out.println(s);
		int lastIndexOf = s.lastIndexOf("\\");
		System.out.println(lastIndexOf);
		String substring = s.substring(lastIndexOf+1);
		System.out.println(substring);
	}
	@Test
	public void testjson() {
		JSONObject fromObject = JSONObject.parseObject("{\"code\":0,\"data\":\"发送成功\"}");
		System.out.println(fromObject.get("code"));
	}
	@Test
	public void testjie() {
		String s="/PersonManagement/adminRecruit/allRecruitMessage";
		
	}
	/*@Test
	public void testSMS() throws Exception {
		DefaultProfile profile = DefaultProfile.getProfile("default", "<accessKeyId>", "<accessSecret>");
        IAcsClient client = new DefaultAcsClient(profile);

        CommonRequest request = new CommonRequest();
        //request.setProtocol(ProtocolType.HTTPS);
        request.setMethod(MethodType.POST);
        request.setDomain("dysmsapi.aliyuncs.com");
        request.setVersion("2017-05-25");
        request.setAction("SendSms");
        request.putPathParameter("PhoneNumbers", "15779933526");
        try {
            CommonResponse response = client.getCommonResponse(request);
            System.out.println(response.getData());
        } catch (ServerException e) {
            e.printStackTrace();
        } catch (ClientException e) {
            e.printStackTrace();
        }
	}*/
}
