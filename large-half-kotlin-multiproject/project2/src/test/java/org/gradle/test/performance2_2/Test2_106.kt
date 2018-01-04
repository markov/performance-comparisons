package org.gradle.test.performance2_2

import org.junit.Assert.*

class Test2_106 {
    private val production = Production2_106("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}