package org.gradle.test.performance2_1

import org.junit.Assert.*

class Test2_12 {
    private val production = Production2_12("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}