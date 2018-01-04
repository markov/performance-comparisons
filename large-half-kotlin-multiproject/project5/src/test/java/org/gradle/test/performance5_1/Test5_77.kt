package org.gradle.test.performance5_1

import org.junit.Assert.*

class Test5_77 {
    private val production = Production5_77("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}