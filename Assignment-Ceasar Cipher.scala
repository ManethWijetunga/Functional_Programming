//Alphabet
val alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"

//Encryption
val E=(c:Char,key:Int,a:String)=>
a((a.indexOf(c.toUpper)+key)%a.size)

val neg = (num:Int, a:String) => 
if (num>=0) num else a.size +num

//Decryption
val D=(c:Char,key:Int,a:String)=>
a(neg(((a.indexOf(c.toUpper)-key)%a.size),a))

//Cipher function
val cipher=(algo:(Char,Int,String)=>Char,s:String,key:Int,a:String)=>s.map(algo(_,key,a))


//String declration
val s= "ManethWijetunga"

val ct=cipher(E,s,5,alphabet)
print(ct)

val pt=cipher(D,ct,5,alphabet)
print(pt)
