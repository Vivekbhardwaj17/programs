value=int(100)
for i in range(0,10):
    local=value
    for j in range(0,9):
        print(local,end="\t")
        local=local-(10-i)
    value=value-10
    print()