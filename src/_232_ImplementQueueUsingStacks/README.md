### [232] Implement Queue Using Stacks
```java
Stack<Integer> pushStack = new Stack<>(); // where newly offered element goes
Stack<Integer> peekStack = new Stack<>(); // where peek/poll element from
```

1. `push`
 
    push into pushStack

2. `peek`/`poll`

    ```python
    if peekStack not empty:
        peek/poll from peekStack
    else:
        transfer all elements from pushStack to peekStack
        peek/poll from peekStack
    ```

3. e.g. : offer(1), offer(2), peek(); poll(); offer(3)
    
    ```plain    
    offer(1)    pushStack: []      pushStack: [1]
                peekStack: []      peekStack: []
    ----------------------------------------------------
    offer(2)    [1]                [1, 2]
                []                 []
    ----------------------------------------------------
    peek()      [1, 2]             []
                []                 [2, 1] => peek = 1        
    ----------------------------------------------------
    poll()      []                 []
                [2, 1]             [2] => poll = 1
    ----------------------------------------------------
    offer(3)    []                 [3]
                [2]                [2]    
    ----------------------------------------------------
    ```
    
