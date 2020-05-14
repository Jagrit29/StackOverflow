switch(fields.getNumber())
    {
      case 100:
        {
            for(Sub subfield: xmlSubfield)
            {
                switch(subfield.getCode())
                {
                    case 'a':
                        //Statement
                        break;
                    case 'b':
                        //statement
                        break;
                    case 'c':
                        //statement
                        break;
                }
            }
            break;
        }
      case 110:
      {
          //Same as above.
      }
      case 111:
      {
          //Same
      }
      default:
           //If you want to print anything if none of the condition matches.

   }
