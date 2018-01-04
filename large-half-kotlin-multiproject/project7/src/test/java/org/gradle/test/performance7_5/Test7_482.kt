package org.gradle.test.performance7_5

import org.junit.Assert.*

class Test7_482 {
    private val production = Production7_482("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}