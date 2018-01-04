package org.gradle.test.performance36_1

import org.junit.Assert.*

class Test36_46 {
    private val production = Production36_46("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}