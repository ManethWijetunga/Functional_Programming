
//19001942

object Assignment1 extends App{
    def ConvertToFarenheit(a:Double)=a*1.8 +32

    def VolumeOfSphere(r:Double) =(4.0/3) * (22.0/7) *r*r*r

    def TotalCost (c:Double) ={
        val PriceAfterDiscount = 24.95 *0.6*c 
        val ShippingCost = 3.00

        if (c>50){
            PriceAfterDiscount +ShippingCost + (c-50) *0.75
        }else{
            PriceAfterDiscount +ShippingCost
        }
    }

    println(ConvertToFarenheit(35)+"Farenheit");
    println(VolumeOfSphere(5)+"Units");
    println("LKR"+ TotalCost(60));
}

