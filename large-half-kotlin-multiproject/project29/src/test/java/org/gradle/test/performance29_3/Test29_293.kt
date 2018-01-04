package org.gradle.test.performance29_3

import org.junit.Assert.*

class Test29_293 {
    private val production = Production29_293("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}