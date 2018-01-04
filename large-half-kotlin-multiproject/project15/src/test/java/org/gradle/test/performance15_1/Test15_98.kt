package org.gradle.test.performance15_1

import org.junit.Assert.*

class Test15_98 {
    private val production = Production15_98("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}