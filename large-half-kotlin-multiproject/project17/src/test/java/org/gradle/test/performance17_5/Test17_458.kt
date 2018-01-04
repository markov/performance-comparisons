package org.gradle.test.performance17_5

import org.junit.Assert.*

class Test17_458 {
    private val production = Production17_458("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}