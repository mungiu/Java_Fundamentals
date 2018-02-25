
public class Person extends Room
{
   Person()
   {
   }

   Person(Room room, String time, String memberName)
   {
      this.room = room;
      this.time = time;
      this.memberName = memberName;
   }

   Room room;
   String time;
   String memberName;

   public Room getRoom()
   {
      return room;
   }

   public void setRoom(Room room)
   {
      this.room = room;
   }

   public String getTime()
   {
      return time;
   }

   public void setTime(String time)
   {
      this.time = time;
   }

   public String getMemberName()
   {
      return memberName;
   }

   public void setMemberName(String memberName)
   {
      this.memberName = memberName;
   }

   @Override
   public String toString()
   {
      return "Person [memberName=" + memberName + "]";
   }
}
