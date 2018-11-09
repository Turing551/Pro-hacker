DECLARE 
@i INT, 
@a INT, 
@count INT, 
@output VARCHAR(6000)

set @i = 1 
set @output = '' 

while(@i <= 1000) 
    begin set @count = 0
    set @a = 1

    while(@a <= @i)
        begin
            if (@i % @a = 0) 
                set @count = @count + 1

            set @a = @a + 1
        end

    if (@count = 2) 
        set @output = @output + cast(@i as varchar(10)) +' '
        set @i = @i + 1
end
set @output=substring(@output,1,(len(@output)-1))
PRINT @output
                                    
                                    
