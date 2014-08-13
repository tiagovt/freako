package freako

import sun.misc.*
import java.security.*

class PasswordCodec{

	static encode = {
		str ->
		MessageDigest digest = MessageDigest.getInstance("SHA")
		digest.update(str.getBytes("UTF-8"))
		return BASE64Encoder().encode(digest.digest())
		
	}

}