package org.gradle.test.performance9_4

import org.junit.Assert.*

class Test9_315 {
    private val production = Production9_315("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}