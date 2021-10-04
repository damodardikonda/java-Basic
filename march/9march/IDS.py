a = 128
a = a << 1
print(a)
print(id(a))


a = a << 2
print(a)
print(id(a))


a = a +  2
print(a)
print(id(a))

k1 = a*a
del  k1

print(id(k1))