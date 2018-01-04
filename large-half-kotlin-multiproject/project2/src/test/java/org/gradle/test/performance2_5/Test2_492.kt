package org.gradle.test.performance2_5

import org.junit.Assert.*

class Test2_492 {
    private val production = Production2_492("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}