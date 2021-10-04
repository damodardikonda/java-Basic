class Stack:
	def __init__(self):
		self.L = []

	def push(self , new_data):
		self.L.append(new_data)

	def top(self): 
    	if len(self.L) == 0: 
    	    return None 
    	return self.L[-1]

	def pop(self): 
    	if len(self.L) == 0: 
        	return None 
    	data = self.L[-1]
    	del self.L[-1]
    	return data 

    def is_empty(self): 
    	return len(self.L) == 0



def main(): 
    S = Stack() 
    if is_empty(S) == True: 
        print("Stack is empty")
    data = top(S)
    if data is None: 
        print("Cannot top an empty stack")
    data = top(S)
    if data is None: 
        print("Cannot pop an empty stack")
    for x in range(1, 11): 
        push(x)
    data = top(S)
    print("Top element:", data)
    
    while is_empty(S) != True: 
        data = pop(S)
        print("Poped data:", data)

    del S 
    sys.exit(0)

main() 
    