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
    if S.is_empty() == True: 
        print("Stack is empty")
    data = S.top()
    if data is None: 
        print("Cannot top an empty stack")
    data = S.top()
    if data is None: 
        print("Cannot pop an empty stack")
    for x in range(1, 11): 
        S.push(x)
    data = S.top()
    print("Top element:", data)
    
    while S.is_empty() != True: 
        data = S.pop()
        print("Poped data:", data)

    del S 
    sys.exit(0)

main() 
    