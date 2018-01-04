package org.gradle.test.performance26_1

import org.junit.Assert.*

class Test26_99 {
    private val production = Production26_99("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}