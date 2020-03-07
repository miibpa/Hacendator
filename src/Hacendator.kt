class Hacendator(val data: String){

    fun execute(input: MutableList<Int>, pointer: Int): String {
       // val intArray = stringToIntArray(input).toMutableList()
        val operation = takeOperation(input, pointer)
        if(operation.size == 4){
            if(operation[0] == 1) {
                input[operation[3]] = input[operation[1]] + input[operation[2]]
            }else if(operation[0] == 2) {
                input[operation[3]] = input[operation[1]] - input[operation[2]]
            }
        }
        return if(operation[0] == 99) {
            input.joinToString(separator = ",")
        } else {
            execute(input, pointer + 4)
        }
    }

    fun stringToIntArray(input: String): List<Int> {
        return input.split(",").map { it.toInt() }
    }

    fun takeOperation(input: List<Int>, pointer: Int): List<Int> {
        return if (input.size - pointer < 4){
            input.subList(pointer, input.size -1)
        } else{
            input.subList(pointer,pointer+4)
        }

    }
}
