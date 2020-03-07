import org.junit.Test

class HacendatorKtTest {
    @Test
    fun do_calculations(){
        val input = "1,5,1,6,99,5,0"
        val hacendator = Hacendator(input)
        val result = hacendator.execute(hacendator.stringToIntArray(hacendator.data).toMutableList(),0)
        assert(result == "1,5,1,6,99,5,10")
    }

    @Test
    fun do_calculations2(){
        val input = "1,6,1,10,2,10,2,0,99,5,0"
        val hacendator = Hacendator(input)
        val result = hacendator.execute(hacendator.stringToIntArray(hacendator.data).toMutableList(),0)
        assert(result == "7,6,1,10,2,10,2,0,99,5,8")
    }

    @Test
    fun do_calculations3(){
        val input = "1,17,18,17,2,17,0,18,2,18,17,0,99,543,135,34,17,18,0,9843"
        val hacendator = Hacendator(input)
        val result = hacendator.execute(hacendator.stringToIntArray(hacendator.data).toMutableList(),0)
        assert(result == "-1,17,18,17,2,17,0,18,2,18,17,0,99,543,135,34,17,18,17,9843")
    }

    @Test
    fun do_calculations4(){
        val input = Resources.resourceAsString("data.txt")
        val hacendator = Hacendator(input)
        val result = hacendator.execute(hacendator.stringToIntArray(hacendator.data).toMutableList(),0)

        assert(hacendator.stringToIntArray(result)[5025]==-119)
    }
}