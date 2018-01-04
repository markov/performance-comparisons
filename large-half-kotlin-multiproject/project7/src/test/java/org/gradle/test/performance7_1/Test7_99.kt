package org.gradle.test.performance7_1

import org.junit.Assert.*

class Test7_99 {
    private val production = Production7_99("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}