value=int(2)
for i in range(0,10):
    local=value
    for j in range(0,9):
        print(local ,end="\t")
        local+=(i+1)

    value=2*(i+2)
    print()
