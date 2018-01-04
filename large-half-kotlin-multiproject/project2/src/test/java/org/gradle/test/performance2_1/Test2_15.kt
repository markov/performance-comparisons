package org.gradle.test.performance2_1

import org.junit.Assert.*

class Test2_15 {
    private val production = Production2_15("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}