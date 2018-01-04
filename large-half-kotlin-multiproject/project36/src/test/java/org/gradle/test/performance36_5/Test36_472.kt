package org.gradle.test.performance36_5

import org.junit.Assert.*

class Test36_472 {
    private val production = Production36_472("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}