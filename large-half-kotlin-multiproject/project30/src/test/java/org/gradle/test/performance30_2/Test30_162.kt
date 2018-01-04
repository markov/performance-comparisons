package org.gradle.test.performance30_2

import org.junit.Assert.*

class Test30_162 {
    private val production = Production30_162("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}