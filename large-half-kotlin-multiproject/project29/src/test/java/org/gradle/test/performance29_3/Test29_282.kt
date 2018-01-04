package org.gradle.test.performance29_3

import org.junit.Assert.*

class Test29_282 {
    private val production = Production29_282("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}