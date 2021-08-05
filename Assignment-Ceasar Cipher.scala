//Alphabet
val alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"

//Encryption
val E=(c:Char,key:Int,a:String)=>
a((a.indexOf(c.toUpper)+key)%a.size)

//Decryption
val D=(c:Char,key:Int,a:String)=>
a((a.indexOf(c.toUpper)-key)%a.size)

//Cipher function
val cipher=(algo:(Char,Int,String)=>Char,s:String,key:Int,a:String)=>s.map(algo(_,key,a))


//String declration
val s= "Maneth"

val ct=cipher(E,s,5,alphabet)
print(ct)

val pt=cipher(D,ct,5,alphabet)
print(pt)