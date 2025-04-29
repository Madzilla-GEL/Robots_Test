package io.github.Madzilla_GEL.Model;

public class RobotParts {
}
/*
// Base class for all robot parts
public abstract class RobotPart : MonoBehaviour
{
    public string partName;
    public string partDescription;
    public Sprite partIcon;

    [Serializable]
    public struct StatModifier
    {
        public string statName;
        public float modifierValue;
    }

    public List<StatModifier> statModifiers = new List<StatModifier>();

    public int level = 1;
    public int maxLevel = 5;
    public int upgradeCost = 100;

    public abstract void Equip(); // Called when the part is equipped
    public abstract void Unequip(); // Called when the part is unequipped

    public virtual bool CanUpgrade()
    {
        return level < maxLevel;
    }

    public virtual void Upgrade()
    {
        if (CanUpgrade())
        {
            level++;
            upgradeCost = (int)(upgradeCost * 1.5f); //Increase upgrade cost
            Debug.Log(partName + " upgraded to level " + level);
        }
        else
        {
            Debug.Log("Part is already at max level!");
        }
    }

    // Helper method to get the stat modifier value for a specific stat
    public float GetStatModifier(string statName)
    {
        foreach (StatModifier modifier in statModifiers)
        {
            if (modifier.statName == statName)
            {
                return modifier.modifierValue;
            }
        }
        return 0f; // Return 0 if the stat is not found
    }
}


// Example part: Weapon
public class Weapon : RobotPart
{
    public GameObject projectilePrefab;
    public Transform firePoint;
    public float fireRate = 1f;
    private float nextFireTime = 0f;

    public override void Equip()
    {
        Debug.Log("Weapon equipped: " + partName);
        //Enable weapon specific components and logic
    }

    public override void Unequip()
    {
        Debug.Log("Weapon unequipped: " + partName);
        //Disable weapon specific components and logic
    }

    public void Fire()
    {
        if (Time.time > nextFireTime)
        {
            nextFireTime = Time.time + 1f / fireRate;
            Instantiate(projectilePrefab, firePoint.position, firePoint.rotation);
        }
    }

    public override void Upgrade()
    {
        base.Upgrade();
        // Adjust weapon-specific stats when upgrading
        fireRate += 0.1f; //Example upgrade logic
        Debug.Log("Weapon Fire Rate increased to: " + fireRate);
    }
}

// Example part: Armor
public class Armor : RobotPart
{
    public float defenseBonus = 10f;

    public override void Equip()
    {
        Debug.Log("Armor equipped: " + partName);
        //Apply the armor bonus to the player's stats
    }

    public override void Unequip()
    {
        Debug.Log("Armor unequipped: " + partName);
        //Remove the armor bonus from the player's stats
    }

    public override void Upgrade()
    {
        base.Upgrade();
        defenseBonus += 5f; // Example Upgrade Logic
        Debug.Log("Armor defense increased to: " + defenseBonus);
    }
}

// Robot Manager to handle parts and stats
public class RobotManager : MonoBehaviour
{
    public List<RobotPart> equippedParts = new List<RobotPart>();

    public float health = 100f;
    public float attackDamage = 20f;
    public float speed = 5f;

    public void EquipPart(RobotPart part)
    {
        if (equippedParts.Contains(part))
        {
            Debug.LogWarning("Part already equipped!");
            return;
        }

        //Unequip existing part of same type
        foreach (RobotPart equippedPart in equippedParts)
        {
            if (equippedPart.GetType() == part.GetType())
            {
                UnequipPart(equippedPart);
                break;
            }
        }

        equippedParts.Add(part);
        part.Equip();
        UpdateStats();
        Debug.Log("Equipped " + part.partName);
    }

    public void UnequipPart(RobotPart part)
    {
        if (equippedParts.Contains(part))
        {
            equippedParts.Remove(part);
            part.Unequip();
            UpdateStats();
            Debug.Log("Unequipped " + part.partName);
        }
        else
        {
            Debug.LogWarning("Part not equipped!");
        }
    }

    private void UpdateStats()
    {
        //Reset base stats
        health = 100f;
        attackDamage = 20f;
        speed = 5f;

        //Apply Stat Modifiers from Equipped Parts
        foreach (RobotPart part in equippedParts)
        {
            health += part.GetStatModifier("Health");
            attackDamage += part.GetStatModifier("AttackDamage");
            speed += part.GetStatModifier("Speed");
        }

        Debug.Log("Stats updated: Health=" + health + ", AttackDamage=" + attackDamage + ", Speed=" + speed);
    }

    public void UpgradePart(RobotPart part)
    {
        if (equippedParts.Contains(part))
        {
            part.Upgrade();
            UpdateStats();
        }
        else
        {
            Debug.LogWarning("Part is not equipped, can't upgrade.");
        }
    }

    //Example usage (for player input or AI)
    public void PerformAttack()
    {
        foreach (RobotPart part in equippedParts)
        {
            if (part is Weapon weapon)
            {
                weapon.Fire();
            }
        }
    }
}
 */