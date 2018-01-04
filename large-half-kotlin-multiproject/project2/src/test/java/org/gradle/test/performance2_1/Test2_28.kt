package org.gradle.test.performance2_1

import org.junit.Assert.*

class Test2_28 {
    private val production = Production2_28("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}