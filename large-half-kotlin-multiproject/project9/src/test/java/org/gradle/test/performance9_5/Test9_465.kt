package org.gradle.test.performance9_5

import org.junit.Assert.*

class Test9_465 {
    private val production = Production9_465("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}