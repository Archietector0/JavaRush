/**
 * Написать девять классов: Workers(сотрудник), Clerk(клерк), IT(ИТ-специалист),
 * Programmer(программист), ProjectManager(менеджер проекта), CTO(технический директор),
 * HR(рекрутер), OfficeManager(офис-менеджер), Cleaner(уборщик).
 * Унаследовать программиста, менеджера проекта и технического директора от ИТ-специалиста.
 * Унаследовать рекрутера, уборщика и офис-менеджера от клерка.
 * Унаследовать клерка и ИТ-специалиста от сотрудника.
 */

public class ITCompany {
    public static void main(String[] args) {}
}

class Workers {}
class Clerk extends Workers {}
class IT extends Workers {}
class Programmer extends IT {}
class ProjectManager extends IT {}
class CTO extends IT {}
class HR extends Clerk {}
class OfficeManager extends Clerk {}
class Clearner extends Clerk {}



