package org.gradle.test.performance33_5

import org.junit.Assert.*

class Test33_406 {
    private val production = Production33_406("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}