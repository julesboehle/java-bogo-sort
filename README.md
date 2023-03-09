# Java bogo sort

Have you ever had a list of 10 random integers and thought to yourself: "Wow I wish there was a stupidly inefficient way to sort these"? Have I got the program for you.

Bogo sort, or stupid sort, is an iterative sorting algorithm that consists of randomly shuffling the elements of a data structure and checking if they are correctly 	sorted. If not, repeat. Since a bogo sort's performance depends entirely on probability, the worst case is not measureable.

Best case: O(n)

Worst case: ♾️

------------------------------------------------------------------------------------------------------

If you want the program to actually have a better possiblity of sorting the array, change: 

`int[] arr = generateRandomArray(10);` to `int[] arr = generateRandomArray(5);` on line 5

With the array size set to 5 there is a higher chance that the sort will complete before your CPU melts

![image](https://user-images.githubusercontent.com/121529529/223895266-b9d824da-8b06-4d52-975a-937af7413338.png)

------------------------------------------------------------------------------------------------------
(Enable sound for enhanced immersion)

https://user-images.githubusercontent.com/121529529/222873768-44ca6059-1e60-4fec-b029-4a33b1b847e9.mp4

------------------------------------------------------------------------------------------------------

#TODO
- [ ] Prove quantum bogo
