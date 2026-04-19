fun main(args: Array<String>) {
    /* Read input from STDIN. Print output to STDOUT. */
    val input1 = readln().toInt()
    val input2 = Array(input1){ readln().toInt() }
    var store = mutableListOf<Int>()
    var max = 0

    if(input1 == 0){
        max = 0
    }
    else if(input1 <= 3){
        max = input2[0]
        for(i in 1..input1-1){
            if(max < input2[i]){
                max = input2[i]
            }
        }
    }
    else{
        for(j in 0..input1-1){
            max = input2[j]
            for(i in j+3..input1-1 step 3){

                max = max+input2[i]
            }
            store.add(j,max)
        }

        max = store.max()
    }

    println(max)
}