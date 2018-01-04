package org.gradle.test.performance30_2

import org.junit.Assert.*

class Test30_195 {
    private val production = Production30_195("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}