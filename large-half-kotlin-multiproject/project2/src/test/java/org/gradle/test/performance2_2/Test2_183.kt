package org.gradle.test.performance2_2

import org.junit.Assert.*

class Test2_183 {
    private val production = Production2_183("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}