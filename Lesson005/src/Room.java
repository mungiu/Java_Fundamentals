
public class Room
{
   // super constructor
   Room()
   {
   }

   Room(String block, int floorNr, int seatsNr, boolean projector, int roomNr)
   {
      this.block = block;
      this.floorNr = floorNr;
      this.seatsNr = seatsNr;
      this.projector = projector;
      this.roomNr = roomNr;
   }

   String block;
   int floorNr;
   int seatsNr;
   boolean projector;
   int roomNr;

   public String getBlock()
   {
      return block;
   }

   public void setBlock(String block)
   {
      this.block = block;
   }

   public int getFloorNr()
   {
      return floorNr;
   }

   public void setFloorNr(int floorNr)
   {
      this.floorNr = floorNr;
   }

   public int getSeatsNr()
   {
      return seatsNr;
   }

   public void setSeatsNr(int seatsNr)
   {
      this.seatsNr = seatsNr;
   }

   public boolean isProjector()
   {
      return projector;
   }

   public void setProjector(boolean projector)
   {
      this.projector = projector;
   }

   public int getRoomNr()
   {
      return roomNr;
   }

   public void setRoomNr(int roomNr)
   {
      this.roomNr = roomNr;
   }
}
