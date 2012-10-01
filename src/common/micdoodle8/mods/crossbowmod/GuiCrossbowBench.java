package micdoodle8.mods.crossbowmod;

import org.lwjgl.opengl.GL11;
import net.minecraft.src.*;

public class GuiCrossbowBench extends GuiContainer
{
    public GuiCrossbowBench(InventoryPlayer par1InventoryPlayer)
    {
        super(new ContainerCrossbowBench(par1InventoryPlayer));
    }

    @Override
    protected void drawGuiContainerForegroundLayer()
    {
        this.fontRenderer.drawString("Crossbow Workbench", 10, -13, 4210752);
        this.fontRenderer.drawString(StatCollector.translateToLocal("container.inventory"), 8, 202 - 113 + 2, 4210752);
    }

    @Override
    protected void drawGuiContainerBackgroundLayer(float par1, int par2, int par3)
    {
        int var4 = this.mc.renderEngine.getTexture("/Mic'sMods/CrossbowMod/gui/crossbowTable.png");
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        this.mc.renderEngine.bindTexture(var4);
        int var5 = (this.width - this.xSize) / 2;
        int var6 = (this.height - 202) / 2;
        this.drawTexturedModalRect(var5, var6, 0, 0, this.xSize, 202);
    }
}
